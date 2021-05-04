public class GamerCheckManager implements GamerCheckService {

    @Override
    public boolean checkRealPerson(Gamer gamer) {
        System.out.println(gamer.getIdentificationNumber() + " sistemde geçerli kimlik numarası.");
        return true;
    }
}
