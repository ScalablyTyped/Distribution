package typings.zipcodes

import typings.std.Record
import typings.zipcodes.mod.ZipCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ZipCodes {
    
    @JSGlobal("ZipCodes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("ZipCodes.codes")
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
      
      @JSGlobal("ZipCodes.states")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("ZipCodes.states.abbr")
      @js.native
      def abbr: Record[String, String] = js.native
      inline def abbr_=(x: Record[String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("abbr")(x.asInstanceOf[js.Any])
      
      @JSGlobal("ZipCodes.states.full")
      @js.native
      def full: Record[String, String] = js.native
      inline def full_=(x: Record[String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("full")(x.asInstanceOf[js.Any])
      
      inline def normalize(state: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(state.asInstanceOf[js.Any]).asInstanceOf[String]
    }
    
    inline def toKilometers(miles: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toKilometers")(miles.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def toMiles(kilos: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toMiles")(kilos.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
}
