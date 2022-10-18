package typings.youtubePlayer

import org.scalablytyped.runtime.StringDictionary
import typings.youtubePlayer.distTypesMod.EmitterType
import typings.youtubePlayer.distTypesMod.YouTubePlayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distYouTubePlayerMod {
  
  object default {
    
    @JSImport("youtube-player/dist/YouTubePlayer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def promisifyPlayer(playerAPIReady: js.Promise[YouTubePlayer]): YouTubePlayer = ^.asInstanceOf[js.Dynamic].applyDynamic("promisifyPlayer")(playerAPIReady.asInstanceOf[js.Any]).asInstanceOf[YouTubePlayer]
    inline def promisifyPlayer(playerAPIReady: js.Promise[YouTubePlayer], strictState: Boolean): YouTubePlayer = (^.asInstanceOf[js.Dynamic].applyDynamic("promisifyPlayer")(playerAPIReady.asInstanceOf[js.Any], strictState.asInstanceOf[js.Any])).asInstanceOf[YouTubePlayer]
    
    inline def proxyEvents(emitter: EmitterType): EventHandlerMapType = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyEvents")(emitter.asInstanceOf[js.Any]).asInstanceOf[EventHandlerMapType]
  }
  
  type EventHandlerMapType = StringDictionary[js.Function1[/* event */ js.Object, Unit]]
}
