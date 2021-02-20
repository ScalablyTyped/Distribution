package typings.zipcodes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zipcodes", "distance")
  @js.native
  def distance(zipA: String, zipB: String): Double | Null = js.native
  @JSImport("zipcodes", "distance")
  @js.native
  def distance(zipA: String, zipB: Double): Double | Null = js.native
  @JSImport("zipcodes", "distance")
  @js.native
  def distance(zipA: Double, zipB: String): Double | Null = js.native
  @JSImport("zipcodes", "distance")
  @js.native
  def distance(zipA: Double, zipB: Double): Double | Null = js.native
  
  @JSImport("zipcodes", "lookup")
  @js.native
  def lookup(zip: String): js.UndefOr[ZipCode] = js.native
  @JSImport("zipcodes", "lookup")
  @js.native
  def lookup(zip: Double): js.UndefOr[ZipCode] = js.native
  
  @JSImport("zipcodes", "lookupByCoords")
  @js.native
  def lookupByCoords(lat: Double, lon: Double): String | Null = js.native
  
  @JSImport("zipcodes", "lookupByName")
  @js.native
  def lookupByName(city: String, state: String): js.Array[ZipCode] = js.native
  
  @JSImport("zipcodes", "lookupByState")
  @js.native
  def lookupByState(state: String): js.Array[ZipCode] = js.native
  
  @JSImport("zipcodes", "radius")
  @js.native
  def radius(zip: String, miles: Double, full: Boolean): js.Array[String | ZipCode] = js.native
  @JSImport("zipcodes", "radius")
  @js.native
  def radius(zip: Double, miles: Double, full: Boolean): js.Array[String | ZipCode] = js.native
  
  @JSImport("zipcodes", "random")
  @js.native
  def random(): ZipCode = js.native
  
  @JSImport("zipcodes", "toKilometers")
  @js.native
  def toKilometers(miles: Double): Double = js.native
  
  @JSImport("zipcodes", "toMiles")
  @js.native
  def toMiles(kilos: Double): Double = js.native
  
  @js.native
  trait ZipCode extends StObject {
    
    var city: String = js.native
    
    var country: String = js.native
    
    var latitude: Double = js.native
    
    var longitude: Double = js.native
    
    var state: String = js.native
    
    var zip: String = js.native
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
