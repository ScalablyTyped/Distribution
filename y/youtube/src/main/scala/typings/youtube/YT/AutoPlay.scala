package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AutoPlay extends StObject
@JSGlobal("YT.AutoPlay")
@js.native
object AutoPlay extends StObject {
  
  /**
    * Video will autoplay when loaded.
    */
  @js.native
  sealed trait AutoPlay
    extends StObject
       with typings.youtube.YT.AutoPlay
  
  /**
    * Video does not autoplay.
    */
  @js.native
  sealed trait NoAutoPlay
    extends StObject
       with typings.youtube.YT.AutoPlay
}
