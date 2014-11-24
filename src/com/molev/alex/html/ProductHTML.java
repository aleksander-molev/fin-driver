package com.molev.alex.html;

public class ProductHTML
{
    /*
     * <div id="products">
         <div id="goods">
            <div class="title">Домик для кота</div>
            <div class="photo">
                <h:graphicImage library="images" name="kotodom.jpg" />
            </div>
            <div id="price">
                5000 руб
            </div>
            <div id="buy">

            </div>
            <div id="basket">

            </div>
         </div>
       </div>
     */
    private String title = null;
    private Photo photo = null;
    private double price = 0;
    private String library = "images";
    
    public ProductHTML()
    {
        //add default initializing here and call super(with param)
    }
    
    public ProductHTML(String title, double price, String library, String pathOfPhoto, String altPhotoText, String photoName)
    {
        this.title = title;
        this.price = price;
        this.library = library;
        
        Photo pht = new Photo(pathOfPhoto, altPhotoText, photoName);
        this.photo = pht;
    }
    
    public String getHTMLProduct()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("<div id=\"products\"> <div id=\"goods\"> <div class=\"title\">");
        sb.append(title); sb.append("</div>");
        sb.append("<div class=\"photo\"> <img src=\""); sb.append(generatePhotoElement(photo)); sb.append("\" />"); 
        sb.append("</div><div id=\"price\">");
        sb.append(price); sb.append(" руб"); sb.append("</div> <div id=\"buy\"></div>  <div id=\"basket\"> </div> </div> </div>");
        return sb.toString();
    }
    
    public static void main(String [] args)
    {
        ProductHTML product = new ProductHTML("Котодомик", 11700, "images", "kotodom.jpg", "Супер уютный котодомик", "Super cat house");
        System.out.println(product.getHTMLProduct());
    }
    
    public String generatePhotoElement(Photo photo)
    {
        String template = "/CatHouse/faces/javax.faces.resource/" + photo.getPath() + "?ln=" + getLibrary();
        return template;
    }
    
    public String getLibrary()
    {
        return library;
    }

    public void setLibrary(String library)
    {
        this.library = library;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Photo getPhoto()
    {
        return photo;
    }

    public void setPhoto(Photo photo)
    {
        this.photo = photo;
    }
    
    public void setPhoto(String path, String altText, String nameOfPhoto)
    {
        this.photo = photo;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
}


class Photo
{
    private String path = null;
    private String altText = null;
    private String nameOfPhoto = null;
    
    public Photo()
    {
        this(null, null, null);
    }
    
    public Photo(String path, String altText, String nameOfPhoto)
    {
        this.path = path;
        this.altText = altText;
        this.nameOfPhoto = nameOfPhoto;
    }
    
    public String getPath()
    {
        return path;
    }
    public void setPath(String path)
    {
        this.path = path;
    }
    public String getAltText()
    {
        return altText;
    }
    public void setAltText(String altText)
    {
        this.altText = altText;
    }
    public String getNameOfPhoto()
    {
        return nameOfPhoto;
    }
    public void setNameOfPhoto(String nameOfPhoto)
    {
        this.nameOfPhoto = nameOfPhoto;
    }
    
}