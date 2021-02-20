package typings.ytSearch

import typings.std.Error
import typings.ytSearch.mod.Options
import typings.ytSearch.mod.PlaylistMetadataOptions
import typings.ytSearch.mod.PlaylistMetadataResult
import typings.ytSearch.mod.SearchResult
import typings.ytSearch.mod.VideoMetadataOptions
import typings.ytSearch.mod.VideoMetadataResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(query: String): js.Promise[SearchResult] = js.native
    def apply(
      query: String,
      callback: js.Function2[/* err */ js.UndefOr[Error | String | Null], /* data */ SearchResult, Unit]
    ): Unit = js.native
    def apply(query: Options): js.Promise[SearchResult] = js.native
    def apply(
      query: Options,
      callback: js.Function2[/* err */ js.UndefOr[Error | String | Null], /* data */ SearchResult, Unit]
    ): Unit = js.native
    def apply(query: PlaylistMetadataOptions): js.Promise[PlaylistMetadataResult] = js.native
    def apply(
      query: PlaylistMetadataOptions,
      callback: js.Function2[/* err */ js.UndefOr[Error | String | Null], /* data */ PlaylistMetadataResult, Unit]
    ): Unit = js.native
    def apply(query: VideoMetadataOptions): js.Promise[VideoMetadataResult] = js.native
    def apply(
      query: VideoMetadataOptions,
      callback: js.Function2[/* err */ js.UndefOr[Error | String | Null], /* data */ VideoMetadataResult, Unit]
    ): Unit = js.native
  }
}
