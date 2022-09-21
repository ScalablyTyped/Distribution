package typings.zrender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.zrender.ImagePatternObject
  - typings.zrender.SVGPatternObject
*/
trait PatternObject extends StObject
object PatternObject {
  
  inline def ImagePatternObject(image: Any): typings.zrender.ImagePatternObject = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.zrender.ImagePatternObject]
  }
  
  inline def SVGPatternObject(): typings.zrender.SVGPatternObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.zrender.SVGPatternObject]
  }
}
