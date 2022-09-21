package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlayerState extends StObject
@JSGlobal("YT.PlayerState")
@js.native
object PlayerState extends StObject {
  
  @js.native
  sealed trait BUFFERING
    extends StObject
       with PlayerState
  
  @js.native
  sealed trait CUED
    extends StObject
       with PlayerState
  
  @js.native
  sealed trait ENDED
    extends StObject
       with PlayerState
  
  @js.native
  sealed trait PAUSED
    extends StObject
       with PlayerState
  
  @js.native
  sealed trait PLAYING
    extends StObject
       with PlayerState
  
  @js.native
  sealed trait UNSTARTED
    extends StObject
       with PlayerState
}
