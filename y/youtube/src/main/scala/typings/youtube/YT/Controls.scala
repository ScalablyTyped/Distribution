package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Controls extends StObject
@JSGlobal("YT.Controls")
@js.native
object Controls extends StObject {
  
  /**
    * Player controls do not display.
    */
  @js.native
  sealed trait Hide
    extends StObject
       with Controls
  
  /**
    * Player controls display after a delay.
    */
  @js.native
  sealed trait ShowDelayLoadPlayer
    extends StObject
       with Controls
  
  /**
    * Player controls display.
    */
  @js.native
  sealed trait ShowLoadPlayer
    extends StObject
       with Controls
}
