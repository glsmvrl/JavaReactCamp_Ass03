public class Main {
    public static void main(String[] args){

        Campaign campaign = new Campaign("Bahar",84);
        Game game = new Game(1,"NBA 2K21",419);
        Gamer gamer = new Gamer(30212365,"Gülsüm","Vural",
                "20.04.2000");

        CampaignManager campaignManager = new CampaignManager();
        GameManager gameManager = new GameManager();
        GamerCheckManager gamerCheckManager = new GamerCheckManager();


        System.out.println("Adı: " + gamer.getFirstName() + "\nSoyadı: " + gamer.getLastName() + "\nTC no:" +
                gamer.getIdentificationNumber() + "\nDoğum Tarihi:" + gamer.getBirthDate());
        System.out.println("-----------------------");
        System.out.println("Kampanya adı:" + campaign.getCampaignName() + "\nKampanya indirimi: " + campaign.getDiscount());
        System.out.println("-----------------------");
        System.out.println("Oyun adı: " + game.getGameName() + " " + "\nOyun fiyatı: " + game.getPrice());

        campaignManager.update(campaign);
        System.out.println("-----------------------");

        gameManager.add(game);
        System.out.println("-----------------------");

        gamerCheckManager.checkRealPerson(gamer);
        System.out.println("-----------------------");

        gameManager.buy(gamer,game,campaign);








    }
}
