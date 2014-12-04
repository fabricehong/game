package dishes;

import org.joda.time.DateTime;

/**
 * Created with IntelliJ IDEA.
 * User: fabrice
 * Date: 12/4/14
 * Time: 7:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Product implements Comparable<Product> {

    private final String id;
    private final ProductType productType;
    private final Ordonancer ordonancer;
    private final DateTime expirationDate;


    public Product(Ordonancer ordonancer, String id, ProductType productType, DateTime expirationDate) {
        this.ordonancer = ordonancer;
        this.productType = productType;
        this.expirationDate = expirationDate;
        this.id = id;
    }
    public DateTime getExpirationDate() {
        return expirationDate;
    }

    public String getId() {
        return id;
    }

    @Override
    public int compareTo(Product otherProduct) {
        return ordonancer.compare(this, otherProduct);  //To change body of implemented methods use File | Settings | File Templates.
    }

    public ProductType getProductType() {
        return productType;
    }
}
