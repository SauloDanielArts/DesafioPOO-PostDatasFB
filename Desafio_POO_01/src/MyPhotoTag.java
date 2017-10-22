
import com.restfb.Facebook;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saulo
 */
public class MyPhotoTag {
   @Facebook("tag_uid")
   private String tagUid;

   @Facebook("tag_text")
   private String tagText;

   @Facebook
   private Double x;

   @Facebook
   private Double y;

   // add getter and setter here

    /**
     * @return the tagUid
     */
    public String getTagUid() {
        return tagUid;
    }

    /**
     * @param tagUid the tagUid to set
     */
    public void setTagUid(String tagUid) {
        this.tagUid = tagUid;
    }

    /**
     * @return the tagText
     */
    public String getTagText() {
        return tagText;
    }

    /**
     * @param tagText the tagText to set
     */
    public void setTagText(String tagText) {
        this.tagText = tagText;
    }

    /**
     * @return the x
     */
    public Double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(Double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public Double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(Double y) {
        this.y = y;
    }
}