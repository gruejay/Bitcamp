library(tidyverse)
library(rvest)

df_vowel_quality_inventory_getter <- function() {
  vowel_quality_inventory_url <- "https://wals.info/feature/2A#2/19.3/152.8"
  vowel_quality_inventory_url %>%
    read_html() %>%
    html_node(".span4") %>%
    html_node(".table") %>%
    html_table() %>%
    select(2:3) %>%
    magrittr::set_colnames(c("amount", "count")) %>%
    as_tibble()
}