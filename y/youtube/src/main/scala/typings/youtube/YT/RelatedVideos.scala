package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RelatedVideos extends StObject
@JSGlobal("YT.RelatedVideos")
@js.native
object RelatedVideos extends StObject {
  
  /**
    * Hide related videos after playback is complete.
    */
  @js.native
  sealed trait Hide
    extends StObject
       with RelatedVideos
  
  /**
    * Show related videos after playback is complete.
    */
  @js.native
  sealed trait Show
    extends StObject
       with RelatedVideos
}
