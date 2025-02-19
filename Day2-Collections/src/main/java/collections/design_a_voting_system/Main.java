package collections.design_a_voting_system;

public class Main {
    public static void main(String[] args) {
        VotingSystem election = new VotingSystem();
        election.vote("Om");
        election.vote("Aryan");
        election.vote("Bipin");
        election.vote("Deepraj");
        election.vote("HarshVeer");
        election.vote("Durgesh");
        election.vote("Om");
        election.vote("Durgesh");


        election.displayResults();
        System.out.println("-----------------------------------------------------");
        election.displayVotingOrder();
    }

}
