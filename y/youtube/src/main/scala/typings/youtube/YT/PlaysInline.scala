package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlaysInline extends StObject
@JSGlobal("YT.PlaysInline")
@js.native
object PlaysInline extends StObject {
  
  /**
    * Playback in fullscreen.
    */
  @js.native
  sealed trait Fullscreen
    extends StObject
       with PlaysInline
  
  /**
    * Playback inline
    */
  @js.native
  sealed trait Inline
    extends StObject
       with PlaysInline
}
