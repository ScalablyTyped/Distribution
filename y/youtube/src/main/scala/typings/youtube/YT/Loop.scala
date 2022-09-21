package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Loop extends StObject
@JSGlobal("YT.Loop")
@js.native
object Loop extends StObject {
  
  /**
    * Video or playlist will be played over and over again.
    */
  @js.native
  sealed trait Loop
    extends StObject
       with typings.youtube.YT.Loop
  
  /**
    * Video or playlist will be played only once.
    */
  @js.native
  sealed trait SinglePlay
    extends StObject
       with typings.youtube.YT.Loop
}
