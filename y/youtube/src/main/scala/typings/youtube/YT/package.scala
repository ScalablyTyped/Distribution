package typings.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object YT {
  type ListType = typings.youtube.YT.ListTypePlayer | typings.youtube.YT.ListTypeSearch | typings.youtube.YT.ListTypeUserUploads
  type ListTypePlayer = typings.youtube.youtubeStrings.player
  type ListTypeSearch = typings.youtube.youtubeStrings.search
  type ListTypeUserUploads = typings.youtube.youtubeStrings.user_uploads
  type PlayerEventHandler[TEvent /* <: typings.youtube.YT.PlayerEvent */] = js.Function1[/* event */ TEvent, scala.Unit]
  type SuggestedVideoQuality = typings.youtube.YT.VideoQualityDefault | typings.youtube.YT.VideoQualitySmall | typings.youtube.YT.VideoQualityMedium | typings.youtube.YT.VideoQualityLarge | typings.youtube.YT.VideoQualityHD720 | typings.youtube.YT.VideoQualityHD1080 | typings.youtube.YT.VideoQualityHighRes
  type VideoQualityDefault = typings.youtube.youtubeStrings.default
  type VideoQualityHD1080 = typings.youtube.youtubeStrings.hd1080
  type VideoQualityHD720 = typings.youtube.youtubeStrings.hd720
  type VideoQualityHighRes = typings.youtube.youtubeStrings.highres
  type VideoQualityLarge = typings.youtube.youtubeStrings.large
  type VideoQualityMedium = typings.youtube.youtubeStrings.medium
  type VideoQualitySmall = typings.youtube.youtubeStrings.small
}
