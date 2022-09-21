package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JsApi extends StObject
@JSGlobal("YT.JsApi")
@js.native
object JsApi extends StObject {
  
  /**
    * JavaScript API will be disabled.
    */
  @js.native
  sealed trait Disable
    extends StObject
       with JsApi
  
  /**
    * JavaScript API will be enabled.
    */
  @js.native
  sealed trait Enable
    extends StObject
       with JsApi
}
