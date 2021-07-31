package typings.zipcodes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zipcodes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def distance(zipA: String, zipB: String): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(zipA.asInstanceOf[js.Any], zipB.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  @scala.inline
  def distance(zipA: String, zipB: Double): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(zipA.asInstanceOf[js.Any], zipB.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  @scala.inline
  def distance(zipA: Double, zipB: String): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(zipA.asInstanceOf[js.Any], zipB.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  @scala.inline
  def distance(zipA: Double, zipB: Double): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(zipA.asInstanceOf[js.Any], zipB.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  @scala.inline
  def lookup(zip: String): js.UndefOr[ZipCode] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(zip.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ZipCode]]
  @scala.inline
  def lookup(zip: Double): js.UndefOr[ZipCode] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(zip.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ZipCode]]
  
  @scala.inline
  def lookupByCoords(lat: Double, lon: Double): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupByCoords")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  @scala.inline
  def lookupByName(city: String, state: String): js.Array[ZipCode] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupByName")(city.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.Array[ZipCode]]
  
  @scala.inline
  def lookupByState(state: String): js.Array[ZipCode] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookupByState")(state.asInstanceOf[js.Any]).asInstanceOf[js.Array[ZipCode]]
  
  @scala.inline
  def radius(zip: String, miles: Double, full: Boolean): js.Array[String | ZipCode] = (^.asInstanceOf[js.Dynamic].applyDynamic("radius")(zip.asInstanceOf[js.Any], miles.asInstanceOf[js.Any], full.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | ZipCode]]
  @scala.inline
  def radius(zip: Double, miles: Double, full: Boolean): js.Array[String | ZipCode] = (^.asInstanceOf[js.Dynamic].applyDynamic("radius")(zip.asInstanceOf[js.Any], miles.asInstanceOf[js.Any], full.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | ZipCode]]
  
  @scala.inline
  def random(): ZipCode = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[ZipCode]
  
  @scala.inline
  def toKilometers(miles: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toKilometers")(miles.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def toMiles(kilos: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toMiles")(kilos.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait ZipCode extends StObject {
    
    var city: String
    
    var country: String
    
    var latitude: Double
    
    var longitude: Double
    
    var state: String
    
    var zip: String
  }
  object ZipCode {
    
    @scala.inline
    def apply(city: String, country: String, latitude: Double, longitude: Double, state: String, zip: String): ZipCode = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZipCode]
    }
    
    @scala.inline
    implicit class ZipCodeMutableBuilder[Self <: ZipCode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
}
