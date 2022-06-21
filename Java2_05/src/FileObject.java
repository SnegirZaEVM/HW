public class FileObject {

    private Integer userId;
    private Integer currencyId;
    private Integer amount;

    public FileObject (Integer userId, Integer currencyId, Integer amount) {
        this.userId = userId;
        this.currencyId = currencyId;
        this.amount = amount;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public Integer getAmount() {
        return amount;
    }

}
