package ma.enset.service;

import io.grpc.stub.StreamObserver;
import ma.enset.stubs.JeuGrpc;
import ma.enset.stubs.JeuOuterClass;

public class JeuGrpcService extends JeuGrpc.JeuImplBase {
    private final int secretNumber = 0;
    private int winner;
    private boolean gameStarted;

    public JeuGrpcService() {
    }

    @Override
    public void startGame(JeuOuterClass.StartRequest request, StreamObserver<JeuOuterClass.StartResponse> responseObserver) {
        JeuOuterClass.StartResponse response= JeuOuterClass.StartResponse.newBuilder()
                .setMessage("Welcome !!!")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void guessNumber(JeuOuterClass.GuessRequest request, StreamObserver<JeuOuterClass.GuessResponse> responseObserver) {
        int guess = request.getNumber();
        if (guess < secretNumber) {
            responseObserver.onNext(JeuOuterClass.GuessResponse.newBuilder().setMessage("Votre nombre est plus grand.").build());
        } else if (guess > secretNumber) {
            responseObserver.onNext(JeuOuterClass.GuessResponse.newBuilder().setMessage("Votre nombre est plus petit.").build());
        } else {
            winner = request.getPlayerId();
            responseObserver.onNext(JeuOuterClass.GuessResponse.newBuilder().setMessage("BRAVO vous avez gagné !").build());
            responseObserver.onCompleted();
            return;
        }

        responseObserver.onNext(JeuOuterClass.GuessResponse.newBuilder().setMessage("Essayez encore !").build());
        responseObserver.onCompleted();
    }

    @Override
    public void winner(JeuOuterClass.WinnerRequest request, StreamObserver<JeuOuterClass.WinnerResponse> responseObserver) {
        if (winner == -1) {
            responseObserver.onNext(JeuOuterClass.WinnerResponse.newBuilder().setWinnerId(winner).setMessage("Aucun joueur n'a gagné.").build());
        } else {
            responseObserver.onNext(JeuOuterClass.WinnerResponse.newBuilder().setWinnerId(winner).setMessage("Le gagnant est le joueur " + winner + " !").build());
        }

        responseObserver.onCompleted();
    }


    @Override
    public void addPlayer(JeuOuterClass.PlayerRequest request, StreamObserver<JeuOuterClass.PlayerResponse> responseObserver) {
        super.addPlayer(request, responseObserver);
    }
}
