package typings.zipcodes

import typings.zipcodes.mod.ZipCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ZipCodes {
    
    @JSGlobal("ZipCodes")
    @js.native
    val ^ : js.Any = js.native
    
    inline def distance(zipA: String, zipB: String): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(zipA.asInstanceOf[js.Any], zipB.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
    inline def distance(zipA: String, zipB: Double): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(zipA.asInstanceOf[js.Any], zipB.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
    inline def distance(zipA: Double, zipB: String): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(zipA.asInstanceOf[js.Any], zipB.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
    inline def distance(zipA: Double, zipB: Double): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(zipA.asInstanceOf[js.Any], zipB.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
    
    inline def lookup(zip: String): js.UndefOr[ZipCode] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(zip.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ZipCode]]
    inline def lookup(zip: Double): js.UndefOr[ZipCode] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(zip.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ZipCode]]
    
    inline def lookupByCoords(lat: Double, lon: Double): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupByCoords")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any])).asInstanceOf[String | Null]
    
    inline def lookupByName(city: String, state: String): js.Array[ZipCode] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupByName")(city.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.Array[ZipCode]]
    
    inline def lookupByState(state: String): js.Array[ZipCode] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookupByState")(state.asInstanceOf[js.Any]).asInstanceOf[js.Array[ZipCode]]
    
    inline def radius(zip: String, miles: Double, full: Boolean): js.Array[String | ZipCode] = (^.asInstanceOf[js.Dynamic].applyDynamic("radius")(zip.asInstanceOf[js.Any], miles.asInstanceOf[js.Any], full.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | ZipCode]]
    inline def radius(zip: Double, miles: Double, full: Boolean): js.Array[String | ZipCode] = (^.asInstanceOf[js.Dynamic].applyDynamic("radius")(zip.asInstanceOf[js.Any], miles.asInstanceOf[js.Any], full.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | ZipCode]]
    
    inline def random(): ZipCode = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[ZipCode]
    
    inline def toKilometers(miles: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toKilometers")(miles.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def toMiles(kilos: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toMiles")(kilos.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
}
