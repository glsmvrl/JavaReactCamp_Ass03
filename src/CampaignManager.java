public class CampaignManager implements CampaignService {

    public CampaignManager() {

    }

    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " kampanyası eklendi.");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " kampanyası silindi.");

    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " kampanyası güncellendi.");

    }
}
