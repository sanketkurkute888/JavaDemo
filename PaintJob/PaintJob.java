public class PaintJob {
   public int   getBucketCount(double width,double height,double areaPerBucket,int extraBuckets)
   {
       if(width<0||height<0||areaPerBucket<0||extraBuckets<0)
       {
           return -1;
       }
       else
       {
           return (int)(Math.ceil(((height*width)-(areaPerBucket*extraBuckets))/areaPerBucket));
       }
   }
    public int  getBucketCount(double width,double height,double areaPerBucket)
    {
        if(width<0||height<0||areaPerBucket<0)
        {
            return -1;
        }
        else
        {
            return (int)(Math.ceil(((height*width))/areaPerBucket));
        }
    }
    public int  getBucketCount(double area,double areaPerBucket)
    {
        if(area<0||areaPerBucket<0)
        {
            return -1;
        }
        else
        {
            return (int)(Math.ceil((area)/areaPerBucket));
        }
    }

}
