package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Mute extends StObject
@JSGlobal("YT.Mute")
@js.native
object Mute extends StObject {
  
  /**
    * Player will start muted
    */
  @js.native
  sealed trait Muted
    extends StObject
       with Mute
  
  /**
    * Player will start not muted, with sound
    */
  @js.native
  sealed trait NotMuted
    extends StObject
       with Mute
}
