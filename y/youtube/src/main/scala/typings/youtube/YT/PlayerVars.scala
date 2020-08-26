package typings.youtube.YT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerVars extends js.Object {
  /**
    * Whether to autohide video controls (by default, HideProgressBar).
    */
  var autohide: js.UndefOr[AutoHide] = js.native
  /**
    * Whether to autoplay the video (by default, NoAutoPlay).
    */
  var autoplay: js.UndefOr[AutoPlay] = js.native
  /**
    * Whether to use user-preferred or forced caption loading (by default, UserDefault).
    */
  var cc_load_policy: js.UndefOr[ClosedCaptionsLoadPolicy] = js.native
  /**
    * Player progress bar color
    */
  var color: js.UndefOr[ProgressBarColor] = js.native
  /**
    * How video controls are shown (by default, ShowLoadPlayer).
    */
  var controls: js.UndefOr[Controls] = js.native
  /**
    * Whether to allow keyboard controls (by default, Enable).
    */
  var disablekb: js.UndefOr[KeyboardControls] = js.native
  /**
    * Whether the JavaScript API should be enabled (by default, Disable).
    */
  var enablejsapi: js.UndefOr[JsApi] = js.native
  /**
    * Time, in seconds from the beginning of the video, when to stop playing.
    */
  var end: js.UndefOr[Double] = js.native
  /**
    * Whether to display the full-screen button (by default, Show).
    */
  var fs: js.UndefOr[FullscreenButton] = js.native
  /**
    * Player language as an ISO 639-1 two-letter language code or fully-specified locale.
    */
  var hl: js.UndefOr[String] = js.native
  /**
    * Whether to show video annotations (by default, Show).
    */
  var iv_load_policy: js.UndefOr[IvLoadPolicy] = js.native
  /**
    * Identifies content that will load.
    * If listType is search, this is the search query.
    * If listType is user_uploads, this is the YouTube user.
    * If listType is playlist, this is the playlist ID, prepended by 'PL'.
    */
  var list: js.UndefOr[String] = js.native
  /**
    * Which type of content loads in the player.
    */
  var listType: js.UndefOr[ListType] = js.native
  /**
    * Whether a single video should be looped (by default, SinglePlay).
    */
  var loop: js.UndefOr[Loop] = js.native
  /**
    * Whether to hide some YouTube branding (by default, Full).
    */
  var modestbranding: js.UndefOr[ModestBranding] = js.native
  /**
    * Origin domain for additional security if using the JavaScript API.
    */
  var origin: js.UndefOr[String] = js.native
  /**
    * Comma separated list of video IDs to play after the URL path's video.
    */
  var playlist: js.UndefOr[String] = js.native
  /**
    * Whether videos play inline or fullscreen in an HTML5 player on iOS. (currently by default, Fullscreen).
    */
  var playsinline: js.UndefOr[PlaysInline] = js.native
  /**
    * Whether to show related videos after the video finishes (by default, Show).
    */
  var rel: js.UndefOr[RelatedVideos] = js.native
  /**
    * Whether to show video information before playing (by default, Show).
    */
  var showinfo: js.UndefOr[ShowInfo] = js.native
  /**
    * Time, in seconds from the beginning of the video, when to start playing.
    */
  var start: js.UndefOr[Double] = js.native
}

object PlayerVars {
  @scala.inline
  def apply(): PlayerVars = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerVars]
  }
  @scala.inline
  implicit class PlayerVarsOps[Self <: PlayerVars] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutohide(value: AutoHide): Self = this.set("autohide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutohide: Self = this.set("autohide", js.undefined)
    @scala.inline
    def setAutoplay(value: AutoPlay): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    @scala.inline
    def setCc_load_policy(value: ClosedCaptionsLoadPolicy): Self = this.set("cc_load_policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCc_load_policy: Self = this.set("cc_load_policy", js.undefined)
    @scala.inline
    def setColor(value: ProgressBarColor): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setControls(value: Controls): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    @scala.inline
    def setDisablekb(value: KeyboardControls): Self = this.set("disablekb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisablekb: Self = this.set("disablekb", js.undefined)
    @scala.inline
    def setEnablejsapi(value: JsApi): Self = this.set("enablejsapi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablejsapi: Self = this.set("enablejsapi", js.undefined)
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setFs(value: FullscreenButton): Self = this.set("fs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFs: Self = this.set("fs", js.undefined)
    @scala.inline
    def setHl(value: String): Self = this.set("hl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHl: Self = this.set("hl", js.undefined)
    @scala.inline
    def setIv_load_policy(value: IvLoadPolicy): Self = this.set("iv_load_policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIv_load_policy: Self = this.set("iv_load_policy", js.undefined)
    @scala.inline
    def setList(value: String): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setListType(value: ListType): Self = this.set("listType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListType: Self = this.set("listType", js.undefined)
    @scala.inline
    def setLoop(value: Loop): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setModestbranding(value: ModestBranding): Self = this.set("modestbranding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModestbranding: Self = this.set("modestbranding", js.undefined)
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setPlaylist(value: String): Self = this.set("playlist", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaylist: Self = this.set("playlist", js.undefined)
    @scala.inline
    def setPlaysinline(value: PlaysInline): Self = this.set("playsinline", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaysinline: Self = this.set("playsinline", js.undefined)
    @scala.inline
    def setRel(value: RelatedVideos): Self = this.set("rel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRel: Self = this.set("rel", js.undefined)
    @scala.inline
    def setShowinfo(value: ShowInfo): Self = this.set("showinfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowinfo: Self = this.set("showinfo", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

