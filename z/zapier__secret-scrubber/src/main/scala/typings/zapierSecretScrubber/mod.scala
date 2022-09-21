package typings.zapierSecretScrubber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@zapier/secret-scrubber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findSensitiveValues(obj: js.Array[Any]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findSensitiveValues")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def findSensitiveValues(obj: js.Object): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findSensitiveValues")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def recurseExtract(obj: js.Array[Any], matcher: js.Function2[/* key */ String, /* value */ Any, Boolean]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("recurseExtract")(obj.asInstanceOf[js.Any], matcher.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def recurseExtract(obj: js.Object, matcher: js.Function2[/* key */ String, /* value */ Any, Boolean]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("recurseExtract")(obj.asInstanceOf[js.Any], matcher.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def scrub[T /* <: Scrubbable */](input: T, secretValues: js.Array[String | Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("scrub")(input.asInstanceOf[js.Any], secretValues.asInstanceOf[js.Any])).asInstanceOf[T]
  
  type Scrubbable = String | js.Array[Any] | js.Object
}
