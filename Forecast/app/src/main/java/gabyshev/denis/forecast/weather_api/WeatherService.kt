package gabyshev.denis.forecast.weather_api

import gabyshev.denis.forecast.weather_api.currentPojo.CurrentPojo
import io.reactivex.Observable
import retrofit2.http.*

/**
 * Created by Borya on 23.07.2017.
 */
interface WeatherService {
    @GET("/data/2.5/weather/")
    fun getCurrentWeather(
            @Query("id") id: Long,
            @Query("APPID") appId: String,
            @Query("units") units: String): Observable<CurrentPojo>
}