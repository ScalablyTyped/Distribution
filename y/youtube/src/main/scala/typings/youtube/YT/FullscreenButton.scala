package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FullscreenButton extends StObject
@JSGlobal("YT.FullscreenButton")
@js.native
object FullscreenButton extends StObject {
  
  /**
    * The full screen button is hidden.
    */
  @js.native
  sealed trait Hide
    extends StObject
       with FullscreenButton
  
  /**
    * The full screen button is visible.
    */
  @js.native
  sealed trait Show
    extends StObject
       with FullscreenButton
}
