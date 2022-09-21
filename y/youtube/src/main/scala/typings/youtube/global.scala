package typings.youtube

import typings.std.HTMLElement
import typings.youtube.YT.PlayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object YT {
    
    @JSGlobal("YT.AutoHide")
    @js.native
    object AutoHide extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.youtube.YT.AutoHide & Double] = js.native
      
      /* 0 */ val AlwaysVisible: typings.youtube.YT.AutoHide.AlwaysVisible & Double = js.native
      
      /* 1 */ val HideAllControls: typings.youtube.YT.AutoHide.HideAllControls & Double = js.native
      
      /* 2 */ val HideProgressBar: typings.youtube.YT.AutoHide.HideProgressBar & Double = js.native
    }
    
    @JSGlobal("YT.AutoPlay")
    @js.native
    object AutoPlay extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.youtube.YT.AutoPlay & Double] = js.native
      
      /* 1 */ val AutoPlay: typings.youtube.YT.AutoPlay.AutoPlay & Double = js.native
      
      /* 0 */ val NoAutoPlay: typings.youtube.YT.AutoPlay.NoAutoPlay & Double = js.native
    }
    
    @JSGlobal("YT.ClosedCaptionsLoadPolicy")
    @js.native
    object ClosedCaptionsLoadPolicy extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.youtube.YT.ClosedCaptionsLoadPolicy & Double] = js.native
      
      /* 1 */ val ForceOn: typings.youtube.YT.ClosedCaptionsLoadPolicy.ForceOn & Double = js.native
      
      /* 0 */ val UserDefault: typings.youtube.YT.ClosedCaptionsLoadPolicy.UserDefault & Double = js.native
    }
    
    @JSGlobal("YT.Controls")
    @js.native
    object Controls extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.youtube.YT.Controls & Double] = js.native
      
      /* 0 */ val Hide: typings.youtube.YT.Controls.Hide & Double = js.native
      
      /* 2 */ val ShowDelayLoadPlayer: typings.youtube.YT.Controls.ShowDelayLoadPlayer & Double = js.native
      
      /* 1 */ val ShowLoadPlayer: typings.youtube.YT.Controls.ShowLoadPlayer & Double = js.native
    }
    
    @JSGlobal("YT.FullscreenButton")
    @js.native
    object FullscreenButton extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.youtube.YT.FullscreenButton & Double] = js.native
      
      /* 0 */ val Hide: typings.youtube.YT.FullscreenButton.Hide & Double = js.native
      
      /* 1 */ val Show: typings.youtube.YT.FullscreenButton.Show & Double = js.native
    }
    
    @JSGlobal("YT.IvLoadPolicy")
    @js.native
    object IvLoadPolicy extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.youtube.YT.IvLoadPolicy & Double] = js.native
      
      /* 3 */ val Hide: typings.youtube.YT.IvLoadPolicy.Hide & Double = js.native
      
      /* 1 */ val Show: typings.youtube.YT.IvLoadPolicy.Show & Double = js.native
    }
    
    @JSGlobal("YT.JsApi")
    @js.native
    object JsApi extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.youtube.YT.JsApi & Double] = js.native
      
      /* 0 */ val Disable: typings.youtube.YT.JsApi.Disable & Double = js.native
      
      /* 1 */ val Enable: typings.youtube.YT.JsApi.Enable & Double = js.native
    }
    
    @JSGlobal("YT.KeyboardControls")
    @js.native
    object KeyboardControls extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.youtube.YT.KeyboardControls & Double] = js.native
      
      /* 1 */ val Disable: typings.youtube.YT.KeyboardControls.Disable & Double = js.native
      
      /* 0 */ val Enable: typings.youtube.YT.KeyboardControls.Enable & Double = js.native
    }
    
    @JSGlobal("YT.Loop")
    @js.native
    object Loop extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.youtube.YT.Loop & Double] = js.native
      
      /* 1 */ val Loop: typings.youtube.YT.Loop.Loop & Double = js.native
      
      /* 0 */ val SinglePlay: typings.youtube.YT.Loop.SinglePlay & Double = js.native
    }
    
    @JSGlobal("YT.ModestBranding")
    @js.native
    object ModestBranding extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.youtube.YT.ModestBranding & Double] = js.native
      
      /* 0 */ val Full: typings.youtube.YT.ModestBranding.Full & Double = js.native
      
      /* 1 */ val Modest: typings.youtube.YT.ModestBranding.Modest & Double = js.native
    }
    
    @JSGlobal("YT.Mute")
    @js.native
    object Mute extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.youtube.YT.Mute & Double] = js.native
      
      /* 1 */ val Muted: typings.youtube.YT.Mute.Muted & Double = js.native
      
      /* 0 */ val NotMuted: typings.youtube.YT.Mute.NotMuted & Double = js.native
    }
    
    @JSGlobal("YT.Player")
    @js.native
    open class Player protected ()
      extends StObject
         with typings.youtube.YT.Player {
      /**
        * Initializes a new instance of the Player class.
        *
        * @param container   DOM element to insert the player's <iframe>.
        * @param options   Player options.
        */
      def this(elt: HTMLElement) = this()
      /**
        * Initializes a new instance of the Player class.
        *
        * @param id   ID of the DOM element to insert the player's <iframe>.
        * @param options   Player options.
        */
      def this(id: String) = this()
      def this(elt: HTMLElement, options: PlayerOptions) = this()
      def this(id: String, options: PlayerOptions) = this()
    }
    
    @JSGlobal("YT.PlayerError")
    @js.native
    object PlayerError extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.youtube.YT.PlayerError & Double] = js.native
      
      /* 101 */ val EmbeddingNotAllowed: typings.youtube.YT.PlayerError.EmbeddingNotAllowed & Double = js.native
      
      /* 150 */ val EmbeddingNotAllowed2: typings.youtube.YT.PlayerError.EmbeddingNotAllowed2 & Double = js.native
      
      /* 5 */ val Html5Error: typings.youtube.YT.PlayerError.Html5Error & Double = js.native
      
      /* 2 */ val InvalidParam: typings.youtube.YT.PlayerError.InvalidParam & Double = js.native
      
      /* 100 */ val VideoNotFound: typings.youtube.YT.PlayerError.VideoNotFound & Double = js.native
    }
    
    @JSGlobal("YT.PlayerState")
    @js.native
    object PlayerState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.youtube.YT.PlayerState & Double] = js.native
      
      /* 3 */ val BUFFERING: typings.youtube.YT.PlayerState.BUFFERING & Double = js.native
      
      /* 5 */ val CUED: typings.youtube.YT.PlayerState.CUED & Double = js.native
      
      /* 0 */ val ENDED: typings.youtube.YT.PlayerState.ENDED & Double = js.native
      
      /* 2 */ val PAUSED: typings.youtube.YT.PlayerState.PAUSED & Double = js.native
      
      /* 1 */ val PLAYING: typings.youtube.YT.PlayerState.PLAYING & Double = js.native
      
      /* -1 */ val UNSTARTED: typings.youtube.YT.PlayerState.UNSTARTED & Double = js.native
    }
    
    @JSGlobal("YT.PlaysInline")
    @js.native
    object PlaysInline extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.youtube.YT.PlaysInline & Double] = js.native
      
      /* 0 */ val Fullscreen: typings.youtube.YT.PlaysInline.Fullscreen & Double = js.native
      
      /* 1 */ val Inline: typings.youtube.YT.PlaysInline.Inline & Double = js.native
    }
    
    @JSGlobal("YT.RelatedVideos")
    @js.native
    object RelatedVideos extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.youtube.YT.RelatedVideos & Double] = js.native
      
      /* 0 */ val Hide: typings.youtube.YT.RelatedVideos.Hide & Double = js.native
      
      /* 1 */ val Show: typings.youtube.YT.RelatedVideos.Show & Double = js.native
    }
    
    @JSGlobal("YT.ShowInfo")
    @js.native
    object ShowInfo extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.youtube.YT.ShowInfo & Double] = js.native
      
      /* 0 */ val Hide: typings.youtube.YT.ShowInfo.Hide & Double = js.native
      
      /* 1 */ val Show: typings.youtube.YT.ShowInfo.Show & Double = js.native
    }
  }
}
