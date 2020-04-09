package typings.ytSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ytSearchStrings {
  @js.native
  sealed trait channel extends js.Object
  
  @js.native
  sealed trait list extends js.Object
  
  @js.native
  sealed trait video extends js.Object
  
  @scala.inline
  def channel: channel = "channel".asInstanceOf[channel]
  @scala.inline
  def list: list = "list".asInstanceOf[list]
  @scala.inline
  def video: video = "video".asInstanceOf[video]
}

