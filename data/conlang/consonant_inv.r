library(tidyverse)
library(rvest)

df_consonant_inv_getter <- function() {
  consonant_url <- "https://wals.info/feature/1A#2/19.3/152.8"
  consonant_url %>%
    read_html() %>%
    html_node(".span4") %>%
    html_node(".table") %>%
    html_table() %>%
    select(2:3) %>%
    magrittr::set_colnames(c("size", "count")) %>%
    as_tibble()
}
