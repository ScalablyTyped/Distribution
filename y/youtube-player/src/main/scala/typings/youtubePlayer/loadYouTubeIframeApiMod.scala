package typings.youtubePlayer

import typings.youtubePlayer.typesMod.EmitterType
import typings.youtubePlayer.typesMod.IframeApiType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadYouTubeIframeApiMod {
  
  @JSImport("youtube-player/dist/loadYouTubeIframeApi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(emitter: EmitterType): js.Promise[IframeApiType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(emitter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IframeApiType]]
}
