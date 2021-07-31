package typings.youtubePlayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playerStatesMod {
  
  @JSImport("youtube-player/dist/constants/PlayerStates", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PlayerStates & Double] = js.native
    
    /* 3 */ val BUFFERING: typings.youtubePlayer.playerStatesMod.PlayerStates.BUFFERING & Double = js.native
    
    /* 0 */ val ENDED: typings.youtubePlayer.playerStatesMod.PlayerStates.ENDED & Double = js.native
    
    /* 2 */ val PAUSED: typings.youtubePlayer.playerStatesMod.PlayerStates.PAUSED & Double = js.native
    
    /* 1 */ val PLAYING: typings.youtubePlayer.playerStatesMod.PlayerStates.PLAYING & Double = js.native
    
    /* -1 */ val UNSTARTED: typings.youtubePlayer.playerStatesMod.PlayerStates.UNSTARTED & Double = js.native
    
    /* 5 */ val VIDEO_CUED: typings.youtubePlayer.playerStatesMod.PlayerStates.VIDEO_CUED & Double = js.native
  }
  
  @js.native
  sealed trait PlayerStates extends StObject
  @JSImport("youtube-player/dist/constants/PlayerStates", "PlayerStates")
  @js.native
  object PlayerStates extends StObject {
    
    @js.native
    sealed trait BUFFERING
      extends StObject
         with PlayerStates
    
    @js.native
    sealed trait ENDED
      extends StObject
         with PlayerStates
    
    @js.native
    sealed trait PAUSED
      extends StObject
         with PlayerStates
    
    @js.native
    sealed trait PLAYING
      extends StObject
         with PlayerStates
    
    @js.native
    sealed trait UNSTARTED
      extends StObject
         with PlayerStates
    
    @js.native
    sealed trait VIDEO_CUED
      extends StObject
         with PlayerStates
  }
}
