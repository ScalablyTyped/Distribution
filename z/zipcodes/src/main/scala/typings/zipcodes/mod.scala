package typings.zipcodes

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zipcodes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("zipcodes", "codes")
  @js.native
  val codes: Record[String, ZipCode] = js.native
  
  inline def distance(zipA: String, zipB: String): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(zipA.asInstanceOf[js.Any], zipB.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  inline def distance(zipA: String, zipB: Double): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(zipA.asInstanceOf[js.Any], zipB.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  inline def distance(zipA: Double, zipB: String): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(zipA.asInstanceOf[js.Any], zipB.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  inline def distance(zipA: Double, zipB: Double): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(zipA.asInstanceOf[js.Any], zipB.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  inline def lookup(zip: String): js.UndefOr[ZipCode] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(zip.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ZipCode]]
  inline def lookup(zip: Double): js.UndefOr[ZipCode] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(zip.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ZipCode]]
  
  inline def lookupByCoords(lat: Double, lon: Double): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupByCoords")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def lookupByName(city: String, state: String): js.Array[ZipCode] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupByName")(city.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.Array[ZipCode]]
  
  inline def lookupByState(state: String): js.Array[ZipCode] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookupByState")(state.asInstanceOf[js.Any]).asInstanceOf[js.Array[ZipCode]]
  
  inline def radius(zip: String, miles: Double): js.Array[String | ZipCode] = (^.asInstanceOf[js.Dynamic].applyDynamic("radius")(zip.asInstanceOf[js.Any], miles.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | ZipCode]]
  inline def radius(zip: String, miles: Double, full: Boolean): js.Array[String | ZipCode] = (^.asInstanceOf[js.Dynamic].applyDynamic("radius")(zip.asInstanceOf[js.Any], miles.asInstanceOf[js.Any], full.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | ZipCode]]
  inline def radius(zip: Double, miles: Double): js.Array[String | ZipCode] = (^.asInstanceOf[js.Dynamic].applyDynamic("radius")(zip.asInstanceOf[js.Any], miles.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | ZipCode]]
  inline def radius(zip: Double, miles: Double, full: Boolean): js.Array[String | ZipCode] = (^.asInstanceOf[js.Dynamic].applyDynamic("radius")(zip.asInstanceOf[js.Any], miles.asInstanceOf[js.Any], full.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | ZipCode]]
  
  inline def random(): ZipCode = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[ZipCode]
  
  object states {
    
    @JSImport("zipcodes", "states")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("zipcodes", "states.abbr")
    @js.native
    def abbr: Record[String, String] = js.native
    inline def abbr_=(x: Record[String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("abbr")(x.asInstanceOf[js.Any])
    
    @JSImport("zipcodes", "states.full")
    @js.native
    def full: Record[String, String] = js.native
    inline def full_=(x: Record[String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("full")(x.asInstanceOf[js.Any])
    
    inline def normalize(state: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(state.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def toKilometers(miles: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toKilometers")(miles.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toMiles(kilos: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toMiles")(kilos.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait ZipCode extends StObject {
    
    var city: String
    
    var country: String
    
    var latitude: Double
    
    var longitude: Double
    
    var state: String
    
    var zip: String
  }
  object ZipCode {
    
    inline def apply(city: String, country: String, latitude: Double, longitude: Double, state: String, zip: String): ZipCode = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZipCode]
    }
    
    extension [Self <: ZipCode](x: Self) {
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
}
