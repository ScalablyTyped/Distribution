package typings.youtubePlayer

import org.scalablytyped.runtime.Instantiable2
import typings.std.CustomEvent
import typings.std.DOMHighResTimeStamp
import typings.std.EventTarget
import typings.youtubePlayer.distConstantsPlayerStatesMod.PlayerStates.ENDED
import typings.youtubePlayer.distConstantsPlayerStatesMod.PlayerStates.PAUSED
import typings.youtubePlayer.distConstantsPlayerStatesMod.PlayerStates.PLAYING
import typings.youtubePlayer.distTypesMod.Options
import typings.youtubePlayer.distTypesMod.YouTubePlayer
import typings.youtubePlayer.youtubePlayerBooleans.`false`
import typings.youtubePlayer.youtubePlayerBooleans.`true`
import typings.youtubePlayer.youtubePlayerInts.`0`
import typings.youtubePlayer.youtubePlayerInts.`1`
import typings.youtubePlayer.youtubePlayerInts.`3000`
import typings.youtubePlayer.youtubePlayerInts.`3`
import typings.youtubePlayer.youtubePlayerStrings.playlist
import typings.youtubePlayer.youtubePlayerStrings.red
import typings.youtubePlayer.youtubePlayerStrings.search
import typings.youtubePlayer.youtubePlayerStrings.user_uploads
import typings.youtubePlayer.youtubePlayerStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AcceptableStates extends StObject {
    
    var acceptableStates: js.Tuple2[ENDED, PAUSED]
    
    var stateChangeRequired: `false`
  }
  object AcceptableStates {
    
    inline def apply(acceptableStates: js.Tuple2[ENDED, PAUSED]): AcceptableStates = {
      val __obj = js.Dynamic.literal(acceptableStates = acceptableStates.asInstanceOf[js.Any], stateChangeRequired = false)
      __obj.asInstanceOf[AcceptableStates]
    }
    
    extension [Self <: AcceptableStates](x: Self) {
      
      inline def setAcceptableStates(value: js.Tuple2[ENDED, PAUSED]): Self = StObject.set(x, "acceptableStates", value.asInstanceOf[js.Any])
      
      inline def setStateChangeRequired(value: `false`): Self = StObject.set(x, "stateChangeRequired", value.asInstanceOf[js.Any])
    }
  }
  
  trait Autoplay extends StObject {
    
    var autoplay: js.UndefOr[`0` | `1`] = js.undefined
    
    var cc_lang_pref: js.UndefOr[String] = js.undefined
    
    var cc_load_policy: js.UndefOr[`1`] = js.undefined
    
    var color: js.UndefOr[red | white] = js.undefined
    
    var controls: js.UndefOr[`0` | `1`] = js.undefined
    
    var disablekb: js.UndefOr[`0` | `1`] = js.undefined
    
    var enablejsapi: js.UndefOr[`0` | `1`] = js.undefined
    
    var end: js.UndefOr[Double] = js.undefined
    
    var fs: js.UndefOr[`0` | `1`] = js.undefined
    
    var hl: js.UndefOr[String] = js.undefined
    
    var iv_load_policy: js.UndefOr[`1` | `3`] = js.undefined
    
    var list: js.UndefOr[String] = js.undefined
    
    var listType: js.UndefOr[playlist | search | user_uploads] = js.undefined
    
    var loop: js.UndefOr[`0` | `1`] = js.undefined
    
    var modestbranding: js.UndefOr[`1`] = js.undefined
    
    var origin: js.UndefOr[String] = js.undefined
    
    var playlist: js.UndefOr[String] = js.undefined
    
    var playsinline: js.UndefOr[`0` | `1`] = js.undefined
    
    var rel: js.UndefOr[`0` | `1`] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
    
    var widget_referrer: js.UndefOr[String] = js.undefined
  }
  object Autoplay {
    
    inline def apply(): Autoplay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Autoplay]
    }
    
    extension [Self <: Autoplay](x: Self) {
      
      inline def setAutoplay(value: `0` | `1`): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setCc_lang_pref(value: String): Self = StObject.set(x, "cc_lang_pref", value.asInstanceOf[js.Any])
      
      inline def setCc_lang_prefUndefined: Self = StObject.set(x, "cc_lang_pref", js.undefined)
      
      inline def setCc_load_policy(value: `1`): Self = StObject.set(x, "cc_load_policy", value.asInstanceOf[js.Any])
      
      inline def setCc_load_policyUndefined: Self = StObject.set(x, "cc_load_policy", js.undefined)
      
      inline def setColor(value: red | white): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setControls(value: `0` | `1`): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setDisablekb(value: `0` | `1`): Self = StObject.set(x, "disablekb", value.asInstanceOf[js.Any])
      
      inline def setDisablekbUndefined: Self = StObject.set(x, "disablekb", js.undefined)
      
      inline def setEnablejsapi(value: `0` | `1`): Self = StObject.set(x, "enablejsapi", value.asInstanceOf[js.Any])
      
      inline def setEnablejsapiUndefined: Self = StObject.set(x, "enablejsapi", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setFs(value: `0` | `1`): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
      
      inline def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
      
      inline def setIv_load_policy(value: `1` | `3`): Self = StObject.set(x, "iv_load_policy", value.asInstanceOf[js.Any])
      
      inline def setIv_load_policyUndefined: Self = StObject.set(x, "iv_load_policy", js.undefined)
      
      inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListType(value: playlist | search | user_uploads): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
      
      inline def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setLoop(value: `0` | `1`): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setModestbranding(value: `1`): Self = StObject.set(x, "modestbranding", value.asInstanceOf[js.Any])
      
      inline def setModestbrandingUndefined: Self = StObject.set(x, "modestbranding", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setPlaylist(value: String): Self = StObject.set(x, "playlist", value.asInstanceOf[js.Any])
      
      inline def setPlaylistUndefined: Self = StObject.set(x, "playlist", js.undefined)
      
      inline def setPlaysinline(value: `0` | `1`): Self = StObject.set(x, "playsinline", value.asInstanceOf[js.Any])
      
      inline def setPlaysinlineUndefined: Self = StObject.set(x, "playsinline", js.undefined)
      
      inline def setRel(value: `0` | `1`): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setWidget_referrer(value: String): Self = StObject.set(x, "widget_referrer", value.asInstanceOf[js.Any])
      
      inline def setWidget_referrerUndefined: Self = StObject.set(x, "widget_referrer", js.undefined)
    }
  }
  
  /* Inlined std.CustomEvent<any> & {  data :number} */
  @js.native
  trait CustomEventanydatanumber extends StObject {
    
    /* standard dom */
    val AT_TARGET: Double = js.native
    
    /* standard dom */
    val BUBBLING_PHASE: Double = js.native
    
    /* standard dom */
    val CAPTURING_PHASE: Double = js.native
    
    /* standard dom */
    val NONE: Double = js.native
    
    /** Returns true or false depending on how event was initialized. True if event goes through its target's ancestors in reverse tree order, and false otherwise. */
    /* standard dom */
    val bubbles: Boolean = js.native
    
    /* standard dom */
    var cancelBubble: Boolean = js.native
    
    /** Returns true or false depending on how event was initialized. Its return value does not always carry meaning, but true can indicate that part of the operation during which event was dispatched, can be canceled by invoking the preventDefault() method. */
    /* standard dom */
    val cancelable: Boolean = js.native
    
    /** Returns true or false depending on how event was initialized. True if event invokes listeners past a ShadowRoot node that is the root of its target, and false otherwise. */
    /* standard dom */
    val composed: Boolean = js.native
    
    /** Returns the invocation target objects of event's path (objects on which listeners will be invoked), except for any nodes in shadow trees of which the shadow root's mode is "closed" that are not reachable from event's currentTarget. */
    /* standard dom */
    def composedPath(): js.Array[EventTarget] = js.native
    
    /** Returns the object whose event listener's callback is currently being invoked. */
    /* standard dom */
    val currentTarget: EventTarget | Null = js.native
    
    var data: Double = js.native
    
    /** Returns true if preventDefault() was invoked successfully to indicate cancelation, and false otherwise. */
    /* standard dom */
    val defaultPrevented: Boolean = js.native
    
    /** Returns any custom data event was created with. Typically used for synthetic events. */
    /* standard dom */
    val detail: Any = js.native
    
    /** Returns the event's phase, which is one of NONE, CAPTURING_PHASE, AT_TARGET, and BUBBLING_PHASE. */
    /* standard dom */
    val eventPhase: Double = js.native
    
    /** @deprecated */
    /* standard dom */
    def initCustomEvent(`type`: String): Unit = js.native
    def initCustomEvent(`type`: String, bubbles: Boolean): Unit = js.native
    def initCustomEvent(`type`: String, bubbles: Boolean, cancelable: Boolean): Unit = js.native
    def initCustomEvent(`type`: String, bubbles: Boolean, cancelable: Boolean, detail: Any): Unit = js.native
    def initCustomEvent(`type`: String, bubbles: Boolean, cancelable: Unit, detail: Any): Unit = js.native
    def initCustomEvent(`type`: String, bubbles: Unit, cancelable: Boolean): Unit = js.native
    def initCustomEvent(`type`: String, bubbles: Unit, cancelable: Boolean, detail: Any): Unit = js.native
    def initCustomEvent(`type`: String, bubbles: Unit, cancelable: Unit, detail: Any): Unit = js.native
    
    /** @deprecated */
    /* standard dom */
    def initEvent(`type`: String): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean, cancelable: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Unit, cancelable: Boolean): Unit = js.native
    
    /** Returns true if event was dispatched by the user agent, and false otherwise. */
    /* standard dom */
    val isTrusted: Boolean = js.native
    
    /** If invoked when the cancelable attribute value is true, and while executing a listener for the event with passive set to false, signals to the operation that caused event to be dispatched that it needs to be canceled. */
    /* standard dom */
    def preventDefault(): Unit = js.native
    
    /** @deprecated */
    /* standard dom */
    var returnValue: Boolean = js.native
    
    /** @deprecated */
    /* standard dom */
    val srcElement: EventTarget | Null = js.native
    
    /** Invoking this method prevents event from reaching any registered event listeners after the current one finishes running and, when dispatched in a tree, also prevents event from reaching any other objects. */
    /* standard dom */
    def stopImmediatePropagation(): Unit = js.native
    
    /** When dispatched in a tree, invoking this method prevents event from reaching any objects other than the current object. */
    /* standard dom */
    def stopPropagation(): Unit = js.native
    
    /** Returns the object to which event is dispatched (its target). */
    /* standard dom */
    val target: EventTarget | Null = js.native
    
    /** Returns the event's timestamp as the number of milliseconds measured relative to the time origin. */
    /* standard dom */
    val timeStamp: DOMHighResTimeStamp = js.native
    
    /** Returns the type of event, e.g. "click", "hashchange", or "submit". */
    /* standard dom */
    val `type`: String = js.native
  }
  
  trait EndSeconds extends StObject {
    
    var endSeconds: js.UndefOr[Double] = js.undefined
    
    var startSeconds: js.UndefOr[Double] = js.undefined
    
    var suggestedQuality: js.UndefOr[String] = js.undefined
    
    var videoId: String
  }
  object EndSeconds {
    
    inline def apply(videoId: String): EndSeconds = {
      val __obj = js.Dynamic.literal(videoId = videoId.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndSeconds]
    }
    
    extension [Self <: EndSeconds](x: Self) {
      
      inline def setEndSeconds(value: Double): Self = StObject.set(x, "endSeconds", value.asInstanceOf[js.Any])
      
      inline def setEndSecondsUndefined: Self = StObject.set(x, "endSeconds", js.undefined)
      
      inline def setStartSeconds(value: Double): Self = StObject.set(x, "startSeconds", value.asInstanceOf[js.Any])
      
      inline def setStartSecondsUndefined: Self = StObject.set(x, "startSeconds", js.undefined)
      
      inline def setSuggestedQuality(value: String): Self = StObject.set(x, "suggestedQuality", value.asInstanceOf[js.Any])
      
      inline def setSuggestedQualityUndefined: Self = StObject.set(x, "suggestedQuality", js.undefined)
      
      inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Index extends StObject {
    
    var index: js.UndefOr[Double] = js.undefined
    
    var list: js.UndefOr[String] = js.undefined
    
    var listType: String
    
    var startSeconds: js.UndefOr[Double] = js.undefined
    
    var suggestedQuality: js.UndefOr[String] = js.undefined
  }
  object Index {
    
    inline def apply(listType: String): Index = {
      val __obj = js.Dynamic.literal(listType = listType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    extension [Self <: Index](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListType(value: String): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setStartSeconds(value: Double): Self = StObject.set(x, "startSeconds", value.asInstanceOf[js.Any])
      
      inline def setStartSecondsUndefined: Self = StObject.set(x, "startSeconds", js.undefined)
      
      inline def setSuggestedQuality(value: String): Self = StObject.set(x, "suggestedQuality", value.asInstanceOf[js.Any])
      
      inline def setSuggestedQualityUndefined: Self = StObject.set(x, "suggestedQuality", js.undefined)
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable2[/* elementId */ String, /* options */ Options, YouTubePlayer]
  
  trait MediaContentUrl extends StObject {
    
    var endSeconds: js.UndefOr[Double] = js.undefined
    
    var mediaContentUrl: String
    
    var startSeconds: js.UndefOr[Double] = js.undefined
    
    var suggestedQuality: js.UndefOr[String] = js.undefined
  }
  object MediaContentUrl {
    
    inline def apply(mediaContentUrl: String): MediaContentUrl = {
      val __obj = js.Dynamic.literal(mediaContentUrl = mediaContentUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaContentUrl]
    }
    
    extension [Self <: MediaContentUrl](x: Self) {
      
      inline def setEndSeconds(value: Double): Self = StObject.set(x, "endSeconds", value.asInstanceOf[js.Any])
      
      inline def setEndSecondsUndefined: Self = StObject.set(x, "endSeconds", js.undefined)
      
      inline def setMediaContentUrl(value: String): Self = StObject.set(x, "mediaContentUrl", value.asInstanceOf[js.Any])
      
      inline def setStartSeconds(value: Double): Self = StObject.set(x, "startSeconds", value.asInstanceOf[js.Any])
      
      inline def setStartSecondsUndefined: Self = StObject.set(x, "startSeconds", js.undefined)
      
      inline def setSuggestedQuality(value: String): Self = StObject.set(x, "suggestedQuality", value.asInstanceOf[js.Any])
      
      inline def setSuggestedQualityUndefined: Self = StObject.set(x, "suggestedQuality", js.undefined)
    }
  }
  
  trait StateChangeRequired extends StObject {
    
    var acceptableStates: js.Tuple2[ENDED, PLAYING]
    
    var stateChangeRequired: `false`
  }
  object StateChangeRequired {
    
    inline def apply(acceptableStates: js.Tuple2[ENDED, PLAYING]): StateChangeRequired = {
      val __obj = js.Dynamic.literal(acceptableStates = acceptableStates.asInstanceOf[js.Any], stateChangeRequired = false)
      __obj.asInstanceOf[StateChangeRequired]
    }
    
    extension [Self <: StateChangeRequired](x: Self) {
      
      inline def setAcceptableStates(value: js.Tuple2[ENDED, PLAYING]): Self = StObject.set(x, "acceptableStates", value.asInstanceOf[js.Any])
      
      inline def setStateChangeRequired(value: `false`): Self = StObject.set(x, "stateChangeRequired", value.asInstanceOf[js.Any])
    }
  }
  
  trait Timeout extends StObject {
    
    var acceptableStates: js.Tuple3[ENDED, PLAYING, PAUSED]
    
    var stateChangeRequired: `true`
    
    // TRICKY: `seekTo` may not cause a state change if no buffering is required.
    var timeout: `3000`
  }
  object Timeout {
    
    inline def apply(acceptableStates: js.Tuple3[ENDED, PLAYING, PAUSED]): Timeout = {
      val __obj = js.Dynamic.literal(acceptableStates = acceptableStates.asInstanceOf[js.Any], stateChangeRequired = true, timeout = 3000)
      __obj.asInstanceOf[Timeout]
    }
    
    extension [Self <: Timeout](x: Self) {
      
      inline def setAcceptableStates(value: js.Tuple3[ENDED, PLAYING, PAUSED]): Self = StObject.set(x, "acceptableStates", value.asInstanceOf[js.Any])
      
      inline def setStateChangeRequired(value: `true`): Self = StObject.set(x, "stateChangeRequired", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: `3000`): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ eventType in youtube-player.youtube-player/dist/eventNames.EventType ]:? (event : std.CustomEvent<any>): void} */
  trait eventTypeinEventTypeevent extends StObject {
    
    var apiChange: js.UndefOr[js.Function1[/* event */ CustomEvent[Any], Unit]] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* event */ CustomEvent[Any], Unit]] = js.undefined
    
    var playbackQualityChange: js.UndefOr[js.Function1[/* event */ CustomEvent[Any], Unit]] = js.undefined
    
    var playbackRateChange: js.UndefOr[js.Function1[/* event */ CustomEvent[Any], Unit]] = js.undefined
    
    var ready: js.UndefOr[js.Function1[/* event */ CustomEvent[Any], Unit]] = js.undefined
    
    var stateChange: js.UndefOr[js.Function1[/* event */ CustomEvent[Any], Unit]] = js.undefined
    
    var volumeChange: js.UndefOr[js.Function1[/* event */ CustomEvent[Any], Unit]] = js.undefined
  }
  object eventTypeinEventTypeevent {
    
    inline def apply(): eventTypeinEventTypeevent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[eventTypeinEventTypeevent]
    }
    
    extension [Self <: eventTypeinEventTypeevent](x: Self) {
      
      inline def setApiChange(value: /* event */ CustomEvent[Any] => Unit): Self = StObject.set(x, "apiChange", js.Any.fromFunction1(value))
      
      inline def setApiChangeUndefined: Self = StObject.set(x, "apiChange", js.undefined)
      
      inline def setError(value: /* event */ CustomEvent[Any] => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setPlaybackQualityChange(value: /* event */ CustomEvent[Any] => Unit): Self = StObject.set(x, "playbackQualityChange", js.Any.fromFunction1(value))
      
      inline def setPlaybackQualityChangeUndefined: Self = StObject.set(x, "playbackQualityChange", js.undefined)
      
      inline def setPlaybackRateChange(value: /* event */ CustomEvent[Any] => Unit): Self = StObject.set(x, "playbackRateChange", js.Any.fromFunction1(value))
      
      inline def setPlaybackRateChangeUndefined: Self = StObject.set(x, "playbackRateChange", js.undefined)
      
      inline def setReady(value: /* event */ CustomEvent[Any] => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      inline def setStateChange(value: /* event */ CustomEvent[Any] => Unit): Self = StObject.set(x, "stateChange", js.Any.fromFunction1(value))
      
      inline def setStateChangeUndefined: Self = StObject.set(x, "stateChange", js.undefined)
      
      inline def setVolumeChange(value: /* event */ CustomEvent[Any] => Unit): Self = StObject.set(x, "volumeChange", js.Any.fromFunction1(value))
      
      inline def setVolumeChangeUndefined: Self = StObject.set(x, "volumeChange", js.undefined)
    }
  }
}
