package typings.ytPlayer.mod

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.ytPlayer.ytPlayerStrings.error
import typings.ytPlayer.ytPlayerStrings.playbackQualityChange
import typings.ytPlayer.ytPlayerStrings.playbackRateChange
import typings.ytPlayer.ytPlayerStrings.timeupdate
import typings.ytPlayer.ytPlayerStrings.unplayable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple, robust, blazing-fast YouTube Player API
  *
  * @see https://github.com/feross/yt-player
  */
@js.native
trait YouTubePlayer extends EventEmitter {
  
  /**
    * Removes the <iframe> containing the player and cleans up all resources.
    */
  def destroy(): Unit = js.native
  
  /** Returns true if destroy() has been called on the player. */
  var destroyed: Boolean = js.native
  
  /**
    * The function returns an array of numbers ordered from slowest to fastest
    * playback speed.Even if the player does not support variable playback
    * speeds, the array should always contain at least one value(1).
    */
  def getAvailablePlaybackRates(): js.Array[Double] = js.native
  
  /** Returns the elapsed time in seconds since the video started playing. */
  def getCurrentTime(): Double = js.native
  
  /**
    * Returns the duration in seconds of the currently playing video.Note that
    * getDuration() will return 0 until the video's metadata is loaded, which
    * normally happens just before the video starts playing.
    */
  def getDuration(): Double = js.native
  
  /**
    * This function retrieves the playback rate of the currently playing
    * video.The default playback rate is 1, which indicates that the video is
    * playing at normal speed.Playback rates may include values like 0.25, 0.5,
    * 1, 1.5, and 2.
    */
  def getPlaybackRate(): Double = js.native
  
  /**
    * Returns a number between 0 and 1 that specifies the percentage of the
    * video that the player shows as buffered.
    */
  def getProgress(): Double = js.native
  
  /**
    * Returns the state of the player.Possible values are: 'unstarted',
    * 'ended', 'playing', 'paused', 'buffering', or 'cued'.
    */
  def getState(): YouTubePlayerState = js.native
  
  /** Returns the player's current volume, an integer between 0 and 100. Note that getVolume() will return the volume even if the player is muted. */
  def getVolume(): Double = js.native
  
  /** Returns true if the player is muted, false if not. */
  def isMuted(): Boolean = js.native
  
  /**
    * This function loads the specified videoId. An example of a videoId is
    * 'GKSRyLdjsPA'.
    *
    * Optionally, specify an autoplay parameter to indicate whether the video
    * should begin playing immediately, or wait for a call to player.play().
    * Default is false.
    *
    * This should be the first function called on a new Player instance.
    */
  def load(videoId: String): Unit = js.native
  def load(videoId: String, autoplay: js.UndefOr[scala.Nothing], start: Double): Unit = js.native
  def load(videoId: String, autoplay: Boolean): Unit = js.native
  def load(videoId: String, autoplay: Boolean, start: Double): Unit = js.native
  
  /** Mutes the player. */
  def mute(): Unit = js.native
  
  /**
    * These events fire when the player enters the respective state. These
    * event names are the same as the possible return values from
    * player.getState().
    *
    * When the player first loads a video, it will broadcast an unstarted
    * event. When a video is cued and ready to play, the player will broadcast
    * a cued event.
    */
  def on(event: YouTubePlayerState, callback: js.Function0[Unit]): this.type = js.native
  /**
    * This event fires if a fatal error occurs in the player. This does not
    * include videos that fail to play, for whatever reason.
    */
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* err */ Error, Unit]): this.type = js.native
  /**
    * This event fires whenever the video playback quality changes. Possible
    * values are: 'small', 'medium', 'large', 'hd720', 'hd1080', 'highres'.
    */
  @JSName("on")
  def on_playbackQualityChange(event: playbackQualityChange, callback: js.Function1[/* quality */ YouTubePlayerQuality, Unit]): this.type = js.native
  /** This event fires whenever the video playback rate changes. */
  @JSName("on")
  def on_playbackRateChange(event: playbackRateChange, callback: js.Function1[/* playbackRate */ Double, Unit]): this.type = js.native
  /**
    * This event fires when the time indicated by the getCurrentTime() method
    * has been updated.
    */
  @JSName("on")
  def on_timeupdate(event: timeupdate, callback: js.Function1[/* seconds */ Double, Unit]): this.type = js.native
  /**
    * This event fires if the YouTube player cannot play the given video. This
    * is not a fatal error. This event is reported separately from the 'error'
    * event so there is an opportunity to play another video gracefully.
    * Possible reasons for this error:
    *
    * - The video requested was not found. This error occurs when a video has
    *   been removed (for any reason) or has been marked as private.
    * - The owner of the requested video does not allow it to be played in
    *   embedded players.
    * - The request contains an invalid parameter value. For example, this
    *   error occurs if you specify a videoId that does not have 11 characters,
    *   or if the videoId contains invalid characters, such as exclamation
    *   points or asterisks.
    */
  @JSName("on")
  def on_unplayable(event: unplayable, callback: js.Function1[/* videoId */ String, Unit]): this.type = js.native
  
  /** Pauses the currently loaded video. */
  def pause(): Unit = js.native
  
  /** Plays the currently loaded video. */
  def play(): Unit = js.native
  
  /**
    * Seeks to a specified time in the video.If the player is paused when the
    * function is called, it will remain paused.If the function is called from
    * another state(playing, video cued, etc.), the player will play the
    * video.The player will advance to the closest keyframe before that time
    * unless the player has already downloaded the portion of the video to
    * which the user is seeking.
    */
  def seek(seconds: Double): Unit = js.native
  
  /**
    * This function sets the suggested video quality for the current video.
    * The function causes the video to reload at its current position in the
    * new quality. If the playback quality does change, it will only change
    * for the video being played. Calling this function does not guarantee
    * that the playback quality will actually change. However, if the playback
    * quality does change, the 'playbackqualitychange' event will fire, and
    * your code should respond to the event rather than the fact that it
    * called the setPlaybackQuality function.
    *
    * The suggestedQuality parameter value can be 'small', 'medium', 'large',
    * 'hd720', 'hd1080', 'highres' or 'default'. We recommend that you set the
    * parameter value to 'default', which instructs YouTube to select the most
    * appropriate playback quality, which will vary for different users,
    * videos, systems and other playback conditions.
    *
    * If you call the setPlaybackQuality function with a suggestedQuality
    * level that is not available for the video, then the quality will be set
    * to the next lowest level that is available. In addition, setting
    * suggestedQuality to a value that is not a recognized quality level is
    * equivalent to setting suggestedQuality to 'default'.
    */
  def setPlaybackQuality(suggestedQuality: YouTubePlayerQuality): Unit = js.native
  
  /**
    * This function sets the suggested playback rate for the current video.If
    * the playback rate changes, it will only change for the video that is
    * already being played.Calling load() will reset the playback rate to 1.
    */
  def setPlaybackRate(rate: Double): Unit = js.native
  
  /** Sets the size in pixels of the <iframe> that contains the player. */
  def setSize(width: Double, height: Double): Unit = js.native
  
  /** Sets the volume.Accepts an integer between 0 and 100. */
  def setVolume(volume: Double): Unit = js.native
  
  /**
    * Stops and cancels loading of the current video.This function should be
    * reserved for rare situations when you know that the user will not be
    * watching additional video in the player.If your intent is to pause the
    * video, you should just call pause().If you want to change the video that
    * the player is playing, you can call load() without calling stop() first.
    */
  def stop(): Unit = js.native
  
  /** Unmutes the player. */
  def unMute(): Unit = js.native
  
  /** Returns the currently loaded video ID, i.e.what was passed to load(). */
  var videoId: String = js.native
}
