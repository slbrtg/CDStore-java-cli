
class CDStore {

  public int mYear;
  public String mArtist;
  public String mAlbumName;
  public int mPrice;

  public CDStore(int year, String artist, String albumName, int price) {
    mYear = year;
    mArtist = artist;
    mAlbumName = albumName;
    mPrice = price;
  }

  public boolean worthBuying(int maxPrice){
    return (mPrice < maxPrice);
  }
}
