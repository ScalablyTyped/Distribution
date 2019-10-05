package typings.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object YT {
  import typings.youtube.youtubeStrings.default
  import typings.youtube.youtubeStrings.hd1080
  import typings.youtube.youtubeStrings.hd720
  import typings.youtube.youtubeStrings.highres
  import typings.youtube.youtubeStrings.large
  import typings.youtube.youtubeStrings.medium
  import typings.youtube.youtubeStrings.player
  import typings.youtube.youtubeStrings.search
  import typings.youtube.youtubeStrings.small
  import typings.youtube.youtubeStrings.user_uploads

  type ListType = ListTypePlayer | ListTypeSearch | ListTypeUserUploads
  type ListTypePlayer = player
  type ListTypeSearch = search
  type ListTypeUserUploads = user_uploads
  type PlayerEventHandler[TEvent /* <: PlayerEvent */] = js.Function1[/* event */ TEvent, Unit]
  type SuggestedVideoQuality = VideoQualityDefault | VideoQualitySmall | VideoQualityMedium | VideoQualityLarge | VideoQualityHD720 | VideoQualityHD1080 | VideoQualityHighRes
  type VideoQualityDefault = default
  type VideoQualityHD1080 = hd1080
  type VideoQualityHD720 = hd720
  type VideoQualityHighRes = highres
  type VideoQualityLarge = large
  type VideoQualityMedium = medium
  type VideoQualitySmall = small
}
