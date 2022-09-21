package typings.ytSearch.mod

import typings.ytSearch.anon.FnCall
import typings.ytSearch.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(query: String): js.Promise[SearchResult] = ^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SearchResult]]
inline def apply(
  query: String,
  callback: js.Function2[/* err */ js.UndefOr[js.Error | String | Null], /* data */ SearchResult, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def apply(query: Options): js.Promise[SearchResult] = ^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SearchResult]]
inline def apply(
  query: Options,
  callback: js.Function2[/* err */ js.UndefOr[js.Error | String | Null], /* data */ SearchResult, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def apply(query: PlaylistMetadataOptions): js.Promise[PlaylistMetadataResult] = ^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PlaylistMetadataResult]]
inline def apply(
  query: PlaylistMetadataOptions,
  callback: js.Function2[
  /* err */ js.UndefOr[js.Error | String | Null], 
  /* data */ PlaylistMetadataResult, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def apply(query: VideoMetadataOptions): js.Promise[VideoMetadataResult] = ^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VideoMetadataResult]]
inline def apply(
  query: VideoMetadataOptions,
  callback: js.Function2[/* err */ js.UndefOr[js.Error | String | Null], /* data */ VideoMetadataResult, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def search: FnCall = ^.asInstanceOf[js.Dynamic].selectDynamic("search").asInstanceOf[FnCall]
inline def search(query: String): js.Promise[SearchResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SearchResult]]
inline def search(
  query: String,
  callback: js.Function2[/* err */ js.UndefOr[js.Error | String | Null], /* data */ SearchResult, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def search(query: Options): js.Promise[SearchResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SearchResult]]
inline def search(
  query: Options,
  callback: js.Function2[/* err */ js.UndefOr[js.Error | String | Null], /* data */ SearchResult, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def search(query: PlaylistMetadataOptions): js.Promise[PlaylistMetadataResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PlaylistMetadataResult]]
inline def search(
  query: PlaylistMetadataOptions,
  callback: js.Function2[
  /* err */ js.UndefOr[js.Error | String | Null], 
  /* data */ PlaylistMetadataResult, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def search(query: VideoMetadataOptions): js.Promise[VideoMetadataResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VideoMetadataResult]]
inline def search(
  query: VideoMetadataOptions,
  callback: js.Function2[/* err */ js.UndefOr[js.Error | String | Null], /* data */ VideoMetadataResult, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def search_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("search")(x.asInstanceOf[js.Any])
