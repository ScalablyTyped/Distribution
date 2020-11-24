package typings.youtube

import typings.youtube.YT.AutoHide
import typings.youtube.YT.AutoPlay
import typings.youtube.YT.ClosedCaptionsLoadPolicy
import typings.youtube.YT.Controls
import typings.youtube.YT.FullscreenButton
import typings.youtube.YT.IvLoadPolicy
import typings.youtube.YT.JsApi
import typings.youtube.YT.KeyboardControls
import typings.youtube.YT.Loop
import typings.youtube.YT.ModestBranding
import typings.youtube.YT.PlayerError
import typings.youtube.YT.PlayerState
import typings.youtube.YT.PlaysInline
import typings.youtube.YT.RelatedVideos
import typings.youtube.YT.ShowInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object youtubeNumbers {
  
  @scala.inline
  def `-1`: `-1` = -1.asInstanceOf[`-1`]
  
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  
  @scala.inline
  def `100`: `100` = 100.asInstanceOf[`100`]
  
  @scala.inline
  def `101`: `101` = 101.asInstanceOf[`101`]
  
  @scala.inline
  def `150`: `150` = 150.asInstanceOf[`150`]
  
  @scala.inline
  def `2`: `2` = 2.asInstanceOf[`2`]
  
  @scala.inline
  def `3`: `3` = 3.asInstanceOf[`3`]
  
  @scala.inline
  def `5`: `5` = 5.asInstanceOf[`5`]
  
  @js.native
  sealed trait `-1` extends PlayerState
  
  @js.native
  sealed trait `0`
    extends AutoHide
       with AutoPlay
       with ClosedCaptionsLoadPolicy
       with Controls
       with FullscreenButton
       with JsApi
       with KeyboardControls
       with Loop
       with ModestBranding
       with PlayerState
       with PlaysInline
       with RelatedVideos
       with ShowInfo
  
  @js.native
  sealed trait `1`
    extends AutoHide
       with AutoPlay
       with ClosedCaptionsLoadPolicy
       with Controls
       with FullscreenButton
       with IvLoadPolicy
       with JsApi
       with KeyboardControls
       with Loop
       with ModestBranding
       with PlayerState
       with PlaysInline
       with RelatedVideos
       with ShowInfo
  
  @js.native
  sealed trait `100` extends PlayerError
  
  @js.native
  sealed trait `101` extends PlayerError
  
  @js.native
  sealed trait `150` extends PlayerError
  
  @js.native
  sealed trait `2`
    extends AutoHide
       with Controls
       with PlayerError
       with PlayerState
  
  @js.native
  sealed trait `3`
    extends IvLoadPolicy
       with PlayerState
  
  @js.native
  sealed trait `5`
    extends PlayerError
       with PlayerState
}
