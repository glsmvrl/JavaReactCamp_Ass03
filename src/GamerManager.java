public class GamerManager implements GamerService {

    private GamerCheckService gamerCheckService;
    private GamerManager(GamerCheckService gamerCheckService){
        this.gamerCheckService=gamerCheckService;
    }


    @Override
    public void add(Gamer gamer) {
        if(gamerCheckService.checkRealPerson(gamer)){
            System.out.println(gamer.getFirstName() + " " + gamer.getLastName() +
                    " kişinin kaydı eklendi.");
        }
        else {
            System.out.println(gamer.getFirstName() + " " + gamer.getLastName() +
                    " kişi eklenemedi, hatalı bilgi.");
        }
    }

    @Override
    public void delete(Gamer gamer) {
        if(gamerCheckService.checkRealPerson(gamer)){
            System.out.println(gamer.getFirstName() + " " + gamer.getLastName() +
                    " kişinin kaydı silindi.");
        }
        else {
            System.out.println(gamer.getFirstName() + " " + gamer.getLastName() +
                    " kişi silinemedi, hatalı işlem.");
        }
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println(gamer.getFirstName() + " " + gamer.getLastName() +
                " kişinin kaydı güncellendi..");
    }
}
