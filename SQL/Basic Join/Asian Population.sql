SELECT SUM(City.Population)
FROM City, Country
WHERE City.CountryCode = Country.Code AND Country.Continent = 'Asia';