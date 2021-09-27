package question1;

public class Page implements Turner{

    private String nextPage ;

    public String getNextPage() {
        return nextPage;
    }

    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }

    @Override
    public void turn() {
        System.out.println("next page is : " +  getNextPage());

    }
}
