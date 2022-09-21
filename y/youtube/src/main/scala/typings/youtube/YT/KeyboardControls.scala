package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KeyboardControls extends StObject
@JSGlobal("YT.KeyboardControls")
@js.native
object KeyboardControls extends StObject {
  
  /**
    * Keyboard controls are disabled.
    */
  @js.native
  sealed trait Disable
    extends StObject
       with KeyboardControls
  
  /**
    * Keyboard controls are enabled.
    */
  @js.native
  sealed trait Enable
    extends StObject
       with KeyboardControls
}
