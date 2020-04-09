package typings.ytSearch.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yt-search", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(query: String): js.Promise[SearchResult] = js.native
  def apply(query: String, callback: js.Function2[/* err */ Error, /* data */ SearchResult, Unit]): Unit = js.native
  def apply(query: Options): js.Promise[SearchResult] = js.native
  def apply(query: Options, callback: js.Function2[/* err */ Error, /* data */ SearchResult, Unit]): Unit = js.native
  def apply(query: PlaylistMetadataOptions): js.Promise[PlaylistMetadataResult] = js.native
  def apply(
    query: PlaylistMetadataOptions,
    callback: js.Function2[/* err */ Error, /* data */ PlaylistMetadataResult, Unit]
  ): Unit = js.native
  def apply(query: VideoMetadataOptions): js.Promise[VideoMetadataResult] = js.native
  def apply(
    query: VideoMetadataOptions,
    callback: js.Function2[/* err */ Error, /* data */ VideoMetadataResult, Unit]
  ): Unit = js.native
}

