package typings.youtubePlayer

import org.scalablytyped.runtime.StringDictionary
import typings.youtubePlayer.typesMod.EmitterType
import typings.youtubePlayer.typesMod.YouTubePlayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object youTubePlayerMod {
  
  object default {
    
    @JSImport("youtube-player/dist/YouTubePlayer", "default.promisifyPlayer")
    @js.native
    def promisifyPlayer(playerAPIReady: js.Promise[YouTubePlayer]): YouTubePlayer = js.native
    @JSImport("youtube-player/dist/YouTubePlayer", "default.promisifyPlayer")
    @js.native
    def promisifyPlayer(playerAPIReady: js.Promise[YouTubePlayer], strictState: Boolean): YouTubePlayer = js.native
    
    @JSImport("youtube-player/dist/YouTubePlayer", "default.proxyEvents")
    @js.native
    def proxyEvents(emitter: EmitterType): EventHandlerMapType = js.native
  }
  
  type EventHandlerMapType = StringDictionary[js.Function1[/* event */ js.Object, Unit]]
}
