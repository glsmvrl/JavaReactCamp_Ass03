public class GameManager implements GameService {

    @Override
    public void add(Game game) {
        System.out.println(game.getGameName() + " oyuncu sepetine eklendi.");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getGameName() + " oyuncu sepetinden silindi.");

    }

    @Override
    public void update(Game game) {
        System.out.println(game.getGameName() + " oyuncu sepetinde güncellendi.");

    }

    @Override
    public void buy(Gamer gamer, Game game) {
        System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " " +
                game.getGameName() + " oyununu" + game.getPrice() + " fiyatına satın aldı.");
    }

    @Override
    public void buy(Gamer gamer, Game game, Campaign campaign) {
        double newPrice = game.getPrice() - (game.getPrice() * campaign.getDiscount() / 100 );
        game.setPrice(newPrice);
        System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " " +
                game.getGameName() + " oyununu " + campaign.getCampaignName() + " kampanyası ile %" +
                campaign.getDiscount() + " indirim ile " + String.format("%.2f",game.getPrice()) +
                " fiyata satın aldı.");
    }
}
