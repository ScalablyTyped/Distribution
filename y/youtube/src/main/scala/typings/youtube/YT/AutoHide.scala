package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AutoHide extends StObject
@JSGlobal("YT.AutoHide")
@js.native
object AutoHide extends StObject {
  
  /**
    * Controls are visible throughout the video
    */
  @js.native
  sealed trait AlwaysVisible
    extends StObject
       with AutoHide
  
  /**
    * Progress bar and player controls slide out of view after a couple of seconds.
    */
  @js.native
  sealed trait HideAllControls
    extends StObject
       with AutoHide
  
  /**
    * Progress bar fades out while the player controls remain visible.
    */
  @js.native
  sealed trait HideProgressBar
    extends StObject
       with AutoHide
}
