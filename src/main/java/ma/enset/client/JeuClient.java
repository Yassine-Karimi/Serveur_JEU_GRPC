package ma.enset.client;



import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import ma.enset.stubs.JeuGrpc;
import ma.enset.stubs.JeuOuterClass;

import java.util.Scanner;

    public class JeuClient {
        private final ManagedChannel channel;
        private final JeuGrpc.JeuStub stub;

        public JeuClient(String host, int port) {
            channel = ManagedChannelBuilder.forAddress(host, port)
                    .usePlaintext()
                    .build();
            stub = JeuGrpc.newStub(channel);
        }

        public void start() throws InterruptedException {
            Scanner scanner = new Scanner(System.in);

            // Appel de la méthode startGame du serveur
            JeuOuterClass.StartRequest startRequest = JeuOuterClass.StartRequest.newBuilder().build();
            stub.startGame(startRequest, new StreamObserver<JeuOuterClass.StartResponse>() {

                @Override
                public void onNext(JeuOuterClass.StartResponse startResponse) {
                    System.out.println(startResponse.getMessage());

                }

                @Override
                public void onError(Throwable throwable) {
                    System.err.println(throwable.getMessage());
                }

                @Override
                public void onCompleted() {
                    System.out.println("The game has started!");
                }
            });
            try {
                Thread.sleep(5 * 1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            // Boucle pour deviner le nombre secret
            while (true) {
                System.out.println("Enter your guess:");
                int guess = scanner.nextInt();

                // Appel de la méthode guessNumber du serveur
                JeuOuterClass.GuessRequest guessRequest = JeuOuterClass.GuessRequest.newBuilder().setNumber(guess).build();
                stub.guessNumber(guessRequest, new StreamObserver<JeuOuterClass.GuessResponse>() {
                    @Override
                    public void onNext(JeuOuterClass.GuessResponse guessResponse) {
                        System.out.println(guessResponse.getMessage());
                            System.out.println("Congratulations, you won!");

                    }

                    @Override
                    public void onError(Throwable throwable) {
                        System.err.println(throwable.getMessage());
                    }

                    @Override
                    public void onCompleted() {
                        System.out.println("Game over.");
                        channel.shutdownNow();
                    }
                });
            }
        }

        public static void main(String[] args) throws InterruptedException {
            JeuClient client = new JeuClient("localhost", 1234);
            client.start();
        }
    }


