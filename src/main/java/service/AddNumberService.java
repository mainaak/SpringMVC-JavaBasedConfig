package service;

public class AddNumberService {
    private Integer getSum;
    public AddNumberService(Integer fnum, Integer snum){
        getSum = fnum + snum;
    }

    public Integer getGetSum() {
        return getSum;
    }
}
