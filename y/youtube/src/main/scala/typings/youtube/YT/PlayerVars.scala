package typings.youtube.YT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerVars extends js.Object {
  /**
    * Whether to autohide video controls (by default, HideProgressBar).
    */
  var autohide: js.UndefOr[AutoHide] = js.undefined
  /**
    * Whether to autoplay the video (by default, NoAutoPlay).
    */
  var autoplay: js.UndefOr[AutoPlay] = js.undefined
  /**
    * Whether to use user-preferred or forced caption loading (by default, UserDefault).
    */
  var cc_load_policy: js.UndefOr[ClosedCaptionsLoadPolicy] = js.undefined
  /**
    * Player progress bar color
    */
  var color: js.UndefOr[ProgressBarColor] = js.undefined
  /**
    * How video controls are shown (by default, ShowLoadPlayer).
    */
  var controls: js.UndefOr[Controls] = js.undefined
  /**
    * Whether to allow keyboard controls (by default, Enable).
    */
  var disablekb: js.UndefOr[KeyboardControls] = js.undefined
  /**
    * Whether the JavaScript API should be enabled (by default, Disable).
    */
  var enablejsapi: js.UndefOr[JsApi] = js.undefined
  /**
    * Time, in seconds from the beginning of the video, when to stop playing.
    */
  var end: js.UndefOr[Double] = js.undefined
  /**
    * Whether to display the full-screen button (by default, Show).
    */
  var fs: js.UndefOr[FullscreenButton] = js.undefined
  /**
    * Player language as an ISO 639-1 two-letter language code or fully-specified locale.
    */
  var hl: js.UndefOr[String] = js.undefined
  /**
    * Whether to show video annotations (by default, Show).
    */
  var iv_load_policy: js.UndefOr[IvLoadPolicy] = js.undefined
  /**
    * Identifies content that will load.
    * If listType is search, this is the search query.
    * If listType is user_uploads, this is the YouTube user.
    * If listType is playlist, this is the playlist ID, prepended by 'PL'.
    */
  var list: js.UndefOr[String] = js.undefined
  /**
    * Which type of content loads in the player.
    */
  var listType: js.UndefOr[ListType] = js.undefined
  /**
    * Whether a single video should be looped (by default, SinglePlay).
    */
  var loop: js.UndefOr[Loop] = js.undefined
  /**
    * Whether to hide some YouTube branding (by default, Full).
    */
  var modestbranding: js.UndefOr[ModestBranding] = js.undefined
  /**
    * Origin domain for additional security if using the JavaScript API.
    */
  var origin: js.UndefOr[String] = js.undefined
  /**
    * Comma separated list of video IDs to play after the URL path's video.
    */
  var playlist: js.UndefOr[String] = js.undefined
  /**
    * Whether videos play inline or fullscreen in an HTML5 player on iOS. (currently by default, Fullscreen).
    */
  var playsinline: js.UndefOr[PlaysInline] = js.undefined
  /**
    * Whether to show related videos after the video finishes (by default, Show).
    */
  var rel: js.UndefOr[RelatedVideos] = js.undefined
  /**
    * Whether to show video information before playing (by default, Show).
    */
  var showinfo: js.UndefOr[ShowInfo] = js.undefined
  /**
    * Time, in seconds from the beginning of the video, when to start playing.
    */
  var start: js.UndefOr[Double] = js.undefined
}

object PlayerVars {
  @scala.inline
  def apply(
    autohide: AutoHide = null,
    autoplay: AutoPlay = null,
    cc_load_policy: ClosedCaptionsLoadPolicy = null,
    color: ProgressBarColor = null,
    controls: Controls = null,
    disablekb: KeyboardControls = null,
    enablejsapi: JsApi = null,
    end: js.UndefOr[Double] = js.undefined,
    fs: FullscreenButton = null,
    hl: String = null,
    iv_load_policy: IvLoadPolicy = null,
    list: String = null,
    listType: ListType = null,
    loop: Loop = null,
    modestbranding: ModestBranding = null,
    origin: String = null,
    playlist: String = null,
    playsinline: PlaysInline = null,
    rel: RelatedVideos = null,
    showinfo: ShowInfo = null,
    start: js.UndefOr[Double] = js.undefined
  ): PlayerVars = {
    val __obj = js.Dynamic.literal()
    if (autohide != null) __obj.updateDynamic("autohide")(autohide.asInstanceOf[js.Any])
    if (autoplay != null) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (cc_load_policy != null) __obj.updateDynamic("cc_load_policy")(cc_load_policy.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (disablekb != null) __obj.updateDynamic("disablekb")(disablekb.asInstanceOf[js.Any])
    if (enablejsapi != null) __obj.updateDynamic("enablejsapi")(enablejsapi.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (hl != null) __obj.updateDynamic("hl")(hl.asInstanceOf[js.Any])
    if (iv_load_policy != null) __obj.updateDynamic("iv_load_policy")(iv_load_policy.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (listType != null) __obj.updateDynamic("listType")(listType.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (modestbranding != null) __obj.updateDynamic("modestbranding")(modestbranding.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (playlist != null) __obj.updateDynamic("playlist")(playlist.asInstanceOf[js.Any])
    if (playsinline != null) __obj.updateDynamic("playsinline")(playsinline.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    if (showinfo != null) __obj.updateDynamic("showinfo")(showinfo.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerVars]
  }
}

