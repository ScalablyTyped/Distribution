package typings.zipcodeToTimezone

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zipcode-to-timezone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lookup(zipCode: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(zipCode.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def lookup(zipCode: Double): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(zipCode.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
